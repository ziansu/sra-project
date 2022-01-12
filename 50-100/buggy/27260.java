public static void main(java.lang.String[] args) throws java.lang.Exception {
    ch.unibe.inf.scg_seminar_exceptions.ExceptionVisitor.listAllReturnNullStatements(new java.io.File(args[0]));
    ch.unibe.inf.scg_seminar_exceptions.ExceptionVisitor.listAllTryStatements(new java.io.File(args[0]));
    ch.unibe.inf.scg_seminar_exceptions.ExceptionVisitor.listAllThrowStatements(new java.io.File(args[0]));
    ch.unibe.inf.scg_seminar_exceptions.ExceptionVisitor.listAllThrows(new java.io.File(args[0]));
    ch.unibe.inf.scg_seminar_exceptions.ExceptionVisitor.listClassesDerivedFromException(new java.io.File(args[0]));
}