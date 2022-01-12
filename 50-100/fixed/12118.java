@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.card_overview :
            if (toggleSceneButtons)
                goToSceneOverView(v, true);
            
            break;
        case R.id.card_ingredients :
            if (toggleSceneButtons)
                goToSceneIngredients(v);
            
            break;
        case R.id.card_directions :
            if (toggleSceneButtons)
                goToSceneDirections(v);
            
            break;
        case R.id.card_images :
            if (toggleSceneButtons) {
                goToSceneComments(v);
            }
            break;
    }
}