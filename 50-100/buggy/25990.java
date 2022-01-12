public static void main(java.lang.String[] args) {
    chapter4.Date date1 = new chapter4.Date(11, 23, 1996);
    chapter7.ProgrammingProjects.Adminstrator admin1 = new chapter7.ProgrammingProjects.Adminstrator("Tom", new chapter4.Date(), 120000);
    chapter7.ProgrammingProjects.Adminstrator admin2 = new chapter7.ProgrammingProjects.Adminstrator(admin1);
    chapter7.ProgrammingProjects.Adminstrator admin3 = new chapter7.ProgrammingProjects.Adminstrator("Tom", new chapter4.Date(), 120000);
    java.lang.System.out.println(admin1.equals(admin2));
    java.lang.System.out.println(admin1.equals(admin3));
}