private boolean PutBuilding(int player) {
    boolean ActionSuccess = false;
    java.lang.System.out.println("Please enter the Area index you want to put your building. Keep in mind that you cannot build in an area that already contains either a building or troublemaker. ");
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    int AreaNumber = scan.nextInt();
    ActionSuccess = GameBoard.PlaceBuilding(AreaNumber, ListPlayer.get(player));
    if (ActionSuccess) {
        CardManager.CityArea_Cards[AreaNumber].Status = false;
        ListPlayer.get(player).AddCityAreayCard(CardManager.CityArea_Cards[AreaNumber]);
    }
    return ActionSuccess;
}