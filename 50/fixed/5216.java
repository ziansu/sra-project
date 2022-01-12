public void addItem() {
    if ((amounts) == null)
        amounts = new java.util.ArrayList<>();
    
    amounts.add(new com.sarahehabm.carbcalculator.common.model.Amount());
    notifyDataSetChanged();
}