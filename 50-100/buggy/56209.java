public void ShowCard(int player) {
    for (int i = 0; i < (ListPlayer.get(player).PlayerCards.size()); i++)
        if ((ListPlayer.get(player).PlayerCards.get(i)) != null)
            java.lang.System.out.println((((i + 1) + "- ") + (ListPlayer.get(player).PlayerCards.get(i).GetName())));
        
    
}