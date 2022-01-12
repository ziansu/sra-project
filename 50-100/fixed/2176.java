private void nextStepOnClick(java.lang.Void empty) {
    if (mBattlefield.shouldConfirmAttack()) {
        com.example.srikar.magic.fragment.CombatDialogFragment dialogFragment = new com.example.srikar.magic.fragment.CombatDialogFragment();
        dialogFragment.setListeners(this::attackersConfirmNextStep, this::attackersConfirmSameStep, this::attackersCancel);
        dialogFragment.show(((android.support.v7.app.AppCompatActivity) (mActivity)).getSupportFragmentManager(), "confirm attackers");
    }else {
        mBinding.nextStep.setEnabled(false);
        mGameState.nextStep();
    }
}