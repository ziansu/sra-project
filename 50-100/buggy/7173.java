public java.lang.Object deserialize(java.io.InputStream input) {
    java.lang.Object result = null;
    try {
        com.caucho.hessian.io.Hessian2Input hi = new com.caucho.hessian.io.Hessian2Input(input);
        hi.startMessage();
        result = hi.readObject();
        hi.completeMessage();
        hi.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return result;
}