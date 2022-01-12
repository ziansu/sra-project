public void onClick(android.view.View view) {
    if (((hours) == 12) || ((hours) == 0)) {
        hours = 1;
    }else {
        ++(hours);
    }
    displayHours(hours);
}