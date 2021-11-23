public boolean removeEmail(ch.cyail.mail.EmailModel email) {
    java.lang.System.out.println((("INBOX/" + (email.getId())) + ".mail"));
    java.io.File file = new java.io.File((("INBOX/" + (email.getId())) + ".mail"));
    java.lang.System.out.println(file.getAbsoluteFile());
    if (file.delete()) {
        java.lang.System.out.println(((file.getName()) + " is deleted!"));
        return true;
    }else {
        java.lang.System.out.println("Delete operation is failed.");
        return false;
    }
}