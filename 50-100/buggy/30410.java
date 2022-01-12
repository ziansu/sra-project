@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    context = getActivity();
    rep = htl_leonding.fiplyteam.fiply.data.UebungenRepository.getInstance();
    java.lang.String[] wochentage = new java.lang.String[]{ "Montag" , "Donnerstag" , "Samstag" };
    gAlg = new htl_leonding.fiplyteam.fiply.trainingsplan.GenerateAllgemein(true, 3, wochentage, new java.util.Date());
    phTKra = new htl_leonding.fiplyteam.fiply.trainingsplan.GeneratePhTwoKraftausdauer(wochentage, new java.util.Date(), false);
    return inflater.inflate(R.layout.fragment_trainingsplantest, container, false);
}