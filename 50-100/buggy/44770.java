public com.example.tom.foodbook.Entity.Food getFoodById(int id) {
    java.lang.System.out.println(("getfood:" + id));
    com.example.tom.foodbook.Entity.Food food = new com.example.tom.foodbook.Entity.Food();
    java.util.ArrayList<com.example.tom.foodbook.Entity.Food> foods = this.getFoods();
    for (com.example.tom.foodbook.Entity.Food f : foods) {
        if ((f.getId()) == id) {
            food = f;
        }
    }
    java.lang.System.out.println(("načteno:" + (food.getName())));
    return food;
}