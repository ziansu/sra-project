@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (v));
    java.lang.String s = ((android.widget.CheckBox) (v)).getText().toString();
    dev.blunch.blunch.domain.Dish dish = null;
    for (dev.blunch.blunch.domain.Dish d : hostSuggestions) {
        if (s.equals(d.getName()))
            dish = d;
        
    }
    if (checkBox.isChecked()) {
        guestSuggestions.add(dish);
    }else {
        guestSuggestions.remove(dish);
    }
}