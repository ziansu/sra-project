public void warriorAttack(android.view.View v) {
    java.util.Random rn = new java.util.Random();
    int strike = (rn.nextInt(5)) + 1;
    android.widget.Toast.makeText(this, (("You deal " + strike) + " damage to Priest!"), Toast.LENGTH_SHORT).show();
    dealDamage("Priest", strike);
    findViewById(R.id.warrior_attack).setEnabled(false);
}