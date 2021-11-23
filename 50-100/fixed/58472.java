public static void main(java.lang.String[] args) {
    com.design.pattern.singleton.Government government = new com.design.pattern.singleton.Government();
    government.setOfficer(100);
    java.lang.System.out.println((("government has " + (government.getOfficer())) + " officers. \n"));
    government = new com.design.pattern.singleton.Government();
    java.lang.System.out.println((("government has " + (government.getOfficer())) + " officers."));
}