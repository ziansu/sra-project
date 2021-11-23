public void setType(java.lang.String category) {
    if ((category.equals("Income")) || (category.equals("income"))) {
        type = "Income";
    }else {
        type = "Expense";
    }
}