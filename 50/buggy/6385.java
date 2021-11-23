@java.lang.Override
public void onCreate(com.geno.midikeybdeditor.Bundle savedInstanceState) {
    com.geno.midikeybdeditor.LinearLayout main = new com.geno.midikeybdeditor.LinearLayout(this);
    com.geno.midikeybdeditor.ExpandableListView e = new com.geno.midikeybdeditor.ExpandableListView(this);
    main.addView(e);
    super.onCreate(savedInstanceState);
    setContentView(main);
}