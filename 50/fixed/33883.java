void foo25() {
    try {
        if (true) {
            java.lang.String field1 = "Hello, World!";
            if (true) {
                field1 = new java.lang.String();
            }else {
                field1 += field1;
            }
        }
    } catch (java.lang.Exception ex) {
    }
}