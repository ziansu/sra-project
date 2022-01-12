public static com.xm.counter.Counter DeserializeCounter() {
    try {
        java.io.FileInputStream fileIn = new java.io.FileInputStream(com.xm.counter.Util.fileName);
        java.io.ObjectInputStream in = new java.io.ObjectInputStream(fileIn);
        com.xm.counter.Counter count = ((com.xm.counter.Counter) (in.readObject()));
        in.close();
        fileIn.close();
        return count;
    } catch (java.io.IOException i) {
        return null;
    } catch (java.lang.ClassNotFoundException c) {
        java.lang.System.out.println("Counter class not found");
        return null;
    }
}