public static void main(java.lang.String[] args) {
    com.design.pattern.singleton.Government government = com.design.pattern.singleton.Government.getInstance();
    government.setOfficer(100);
    java.lang.System.out.println((("government has " + (government.getOfficer())) + " officers. \n"));
    government = com.design.pattern.singleton.Government.getInstance();
    java.lang.System.out.println((("government has " + (government.getOfficer())) + " officers."));
}