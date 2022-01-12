@java.lang.Override
public void onClick(android.view.View v) {
    if (amount.isEmpty()) {
        model.setError("Error! Nothing was entered for the ingredient amount!");
    }else {
        try {
            int a = java.lang.Integer.parseInt(amount);
            if ((model.getUnits().equals("%")) && (a > 100)) {
                model.setError("Error! The percentage eaten cannot exceed 100%!");
            }else {
                model.saveAmount(a);
                nextActivity();
            }
        } catch (java.lang.NumberFormatException e) {
            model.setError("Error! The ingredient amount entered is not an integer!");
        }
    }
}