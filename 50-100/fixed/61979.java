@java.lang.Override
public boolean validate(org.netbeans.validation.api.Problems problems, java.lang.String compName, java.lang.String model) {
    boolean result = false;
    try {
        java.lang.Long N = java.lang.Long.parseLong(innerPanel.NField.getText());
        java.lang.Integer M = java.lang.Integer.parseInt(innerPanel.MField.getText());
        result = M <= ((N * (N - 1)) / 2);
    } catch (java.lang.Exception e) {
    }
    if (!result) {
        java.lang.String message = "<html>M &lt;= N * (N - 1) / 2</html>";
        problems.add(message);
    }
    return result;
}