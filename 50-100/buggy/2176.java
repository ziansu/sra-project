private void nextStepOnClick(java.lang.Void empty) {
    mBinding.nextStep.setEnabled(false);
    if (mBattlefield.shouldConfirmAttack()) {
        com.example.srikar.magic.fragment.CombatDialogFragment dialogFragment = new com.example.srikar.magic.fragment.CombatDialogFragment();
        dialogFragment.setListeners(this::attackersConfirmNextStep, this::attackersConfirmSameStep, this::attackersCancel);
        dialogFragment.show(((android.support.v7.app.AppCompatActivity) (mActivity)).getSupportFragmentManager(), "confirm attackers");
    }else {
        mGameState.nextStep();
    }
}