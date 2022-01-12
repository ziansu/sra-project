@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.agenda_page, container, false);
    agendaScreen = ((com.thoughtworks.mobile.awayday.screen.AgendaScreen) (view.findViewById(R.id.agenda_screen)));
    initAgenda();
    return view;
}