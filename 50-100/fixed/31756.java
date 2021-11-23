private void SpellThePic() {
    android.content.Intent intent = new android.content.Intent(this, gl.giskaland.SpellingGame.class);
    android.os.Bundle b = new android.os.Bundle();
    if ((lvl) == 1)
        b.putInt("key", 1);
    
    if ((lvl) == 2)
        b.putInt("key", 2);
    
    if ((lvl) == 3)
        b.putInt("key", 3);
    
    intent.putExtras(b);
    startActivity(intent);
}