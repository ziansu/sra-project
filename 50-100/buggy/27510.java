static javax.management.ObjectName createObjectName(java.lang.String domain, org.apache.catalina.User user) throws javax.management.MalformedObjectNameException {
    javax.management.ObjectName name = null;
    name = new javax.management.ObjectName(((((domain + ":type=User,username=") + (javax.management.ObjectName.quote(user.getUsername()))) + ",database=") + (user.getUserDatabase().getId())));
    return name;
}