@java.lang.Override
public void onClick(android.view.View view) {
    if (de.markusressel.android.library.tutorialtooltip.TutorialTooltip.exists(activity, tutorialId2)) {
        de.markusressel.android.library.tutorialtooltip.TutorialTooltip.remove(activity, tutorialId2, true);
    }else {
        tutorialId2 = de.markusressel.android.library.tutorialtooltip.TutorialTooltip.show(new de.markusressel.android.library.tutorialtooltip.builder.TutorialTooltipBuilder(activity).message(new de.markusressel.android.library.tutorialtooltip.builder.MessageBuilder().text(getString(R.string.tutorial_message_2)).anchor(buttonDialog).gravity(TutorialTooltipView.Gravity.BOTTOM).build()).anchor(buttonBottom, TutorialTooltipView.Gravity.BOTTOM).onClick(onTutorialTooltipClickedListener).build());
    }
}