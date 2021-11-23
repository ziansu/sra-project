public static void main(java.lang.String[] args) {
    com.project.Region region = new com.project.Region();
    region.setState("CO");
    region.setTitle("UCB");
    region.setZipcode(80204);
    com.hibernate.HibernateAnnotationMain.createData();
}