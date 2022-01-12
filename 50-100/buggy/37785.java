private void setPoisonModeClickListener(final android.widget.ImageButton button) {
    button.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            if ((currentDamageMode) == (com.radiationpressure.mickhardins.mtgrecall.GameAssistant.LifeCounterActivity.DAMAGE_MODE_POISON)) {
                currentDamageMode = com.radiationpressure.mickhardins.mtgrecall.GameAssistant.LifeCounterActivity.DAMAGE_MODE_HP;
            }else
                if ((currentDamageMode) != (com.radiationpressure.mickhardins.mtgrecall.GameAssistant.LifeCounterActivity.DAMAGE_MODE_POISON)) {
                    currentDamageMode = com.radiationpressure.mickhardins.mtgrecall.GameAssistant.LifeCounterActivity.DAMAGE_MODE_POISON;
                    clearAllImagebuttonColors();
                    button.setColorFilter(getResources().getColor(R.color.lifecounter_accent));
                }
            
        }
    });
}