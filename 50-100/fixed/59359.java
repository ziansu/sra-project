@java.lang.Override
public void onClick(android.view.View view) {
    com.example.cis.mazeminotaurs.Portfolio.get().addPlayerCharacter(mBaseClass.getCharacter());
    com.example.cis.mazeminotaurs.CharacterSheetFragment fragment = new com.example.cis.mazeminotaurs.CharacterSheetFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt("charIndex", com.example.cis.mazeminotaurs.Portfolio.get().getPortfolio().indexOf(mBaseClass.getCharacter()));
    fragment.setArguments(bundle);
    getFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();
}