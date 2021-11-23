public void goNext(android.view.View view) {
    if (((UserVars.money) - (edu.wisc.ece.wiscotrail.Shop.shoppingTotal)) >= 0) {
        UserVars.num_oxen += edu.wisc.ece.wiscotrail.Shop.amtOxen;
        UserVars.alcohol_gallons += edu.wisc.ece.wiscotrail.Shop.amtAlcohol;
        UserVars.food_lbs += edu.wisc.ece.wiscotrail.Shop.amtFood;
        UserVars.num_clothes += edu.wisc.ece.wiscotrail.Shop.amtClothing;
        UserVars.ammunition += edu.wisc.ece.wiscotrail.Shop.amtAmmunition;
        UserVars.money -= edu.wisc.ece.wiscotrail.Shop.shoppingTotal;
        finish();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "You don't have enough money!", Toast.LENGTH_SHORT).show();
    }
}