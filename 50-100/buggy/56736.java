public void Add_line_via_draw(app.symbolize.Common.Line line) {
    app.symbolize.Common.Session session = app.symbolize.Common.Session.Get_instance();
    if (session.Is_in_world_view()) {
        java.util.ArrayList<app.symbolize.Common.Posn> completed_levels = Get_completed_levels();
        if ((completed_levels.size()) > 1) {
            line.Snap_to_levels(completed_levels);
            if (!(line.Is_dud())) {
                graph.addLast(line);
                ++(lines_drawn);
            }
        }
    }else {
        graph.addLast(line);
        ++(lines_drawn);
    }
}