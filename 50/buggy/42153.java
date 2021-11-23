public static boolean verifyCheckcode(group3.beef.employee.model.EmployeeVO empVO, java.lang.String checkCode) {
    group3.beef.mail.model.GenerateLinkUtils.generateCheckcode(empVO).equals(checkCode);
    return true;
}