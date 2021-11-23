public void showImage(boolean idolized, android.widget.ImageView view) {
    android.util.Log.d("im", ((("ID: " + (id)) + "\n URL showImage:") + (card_image)));
    if (idolized || (is_promo))
        new lu.schoolido.sukutomo.sukutomo.Card.LoadImage(view).execute(card_idolized_image, card_image);
    else
        new lu.schoolido.sukutomo.sukutomo.Card.LoadImage(view).execute(card_image, card_idolized_image);
    
}