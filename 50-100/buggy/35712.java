public static void main(java.lang.String[] args) {
    if ((args.length) != 1) {
        java.lang.System.out.println("USAGE: testCTF <CLA_IP>");
        return ;
    }
    try {
        CTFs ctf = new CTFs("128.6.13.233");
        ctf.run();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}