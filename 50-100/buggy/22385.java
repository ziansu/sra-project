public static void sendViolation(pe.chalk.takoyaki.data.Violation violation, pe.chalk.takoyaki.data.Member[] recipients) {
    java.lang.String subject = violation.getName();
    java.lang.String body = java.lang.String.format("%s%n%n사유: %s%n수준: %s%n작성자: %s", violation.getViolation(), violation.getName(), violation.getLevel(), violation.getViolator());
    pe.chalk.takoyaki.utils.Mailer.sendMail(violation.getPrefix(), subject, body, recipients);
}