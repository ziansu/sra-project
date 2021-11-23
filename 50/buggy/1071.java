public void onClick(android.view.View view) {
    if ((hours) == 1) {
        hours = 12;
    }else {
        --(hours);
    }
    displayHours(hours);
}