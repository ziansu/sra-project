@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_view_team_info, container, false);
    com.team2944.luke.scouting.Fragments.ViewTeamInfoFragment.teamNumber = ((android.widget.TextView) (view.findViewById(R.id.view_team_number)));
    com.team2944.luke.scouting.Fragments.ViewTeamInfoFragment.teamName = ((android.widget.TextView) (view.findViewById(R.id.view_team_name)));
    com.team2944.luke.scouting.Fragments.ViewTeamInfoFragment.teamLocation = ((android.widget.TextView) (view.findViewById(R.id.view_team_location)));
    com.team2944.luke.scouting.Fragments.ViewTeamInfoFragment.teamNotes = ((android.widget.TextView) (view.findViewById(R.id.view_team_notes)));
    return view;
}