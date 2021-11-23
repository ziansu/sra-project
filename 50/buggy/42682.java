@java.lang.Override
public int compare(ca.mcgill.ecse321.foodtruck.model.FoodItem item1, ca.mcgill.ecse321.foodtruck.model.FoodItem item2) {
    return (item1.getAmountSold()) - (item2.getAmountSold());
}