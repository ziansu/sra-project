public java.lang.Object deepCopy(java.lang.Object o) throws org.hibernate.HibernateException {
    if (o == null) {
        return null;
    }
    return new play.db.jpa.Blob(((play.db.jpa.Blob) (o)).UUID, ((play.db.jpa.Blob) (o)).type);
}