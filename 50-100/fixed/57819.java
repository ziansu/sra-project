@java.lang.Override
public void onBackPressed() {
    if ((backstack) > 0) {
        character = character.removeProgress(viewPager.getCurrentItem());
        Otto.BUS.getBus().post(new amagi82.modularcharactersheetcreator.ui.edit.CharacterUpdatedEvent());
        viewPager.previousPage();
        (backstack)--;
        if ((viewPager.getCurrentItem()) == 0)
            binding.getEditViewModel().splashUrl.set(0);
        
    }else
        super.onBackPressed();
    
}