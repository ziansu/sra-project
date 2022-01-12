private void launchBattleFrags() {
    if ((battleUIFragment) == null) {
        battleUIFragment = new com.pokemonbattlearena.android.BattleUIFragment();
    }
    if (!(battleBegun)) {
        battleBegun = true;
        getFragmentManager().beginTransaction().add(R.id.battle_ui_container, battleUIFragment).commitAllowingStateLoss();
    }
}