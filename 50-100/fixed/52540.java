private void updateObjectList() {
    java.util.ArrayList<model.entity.Entity> newEntities = new java.util.ArrayList<>();
    for (model.entity.candymodels.Candy candy : player1.getActiveCandies()) {
        newEntities.add(candy);
    }
    for (model.entity.kids.Kid kid : level.getActiveKids()) {
        newEntities.add(kid);
    }
    newEntities.add(player1);
    model.Model.objects = newEntities;
}