private wywasm.Expr write(wywasm.Codes.Update c) {
    java.lang.System.out.println(c);
    if (isArray(c.type(0))) {
        return writeArrayUpdate(c);
    }else {
        return writeRecordUpdate(c);
    }
}