public void doFunction(Bruwmbruwm.Taxi t, int Id) {
    switch (t.function) {
        case PICK :
            output.pickUpPassenger(Id, t.served.goal_node);
            t.path = astar.aStar(t.taxiPosition, t.served.goal_node);
            t.function = State.DROP;
            break;
        case DROP :
            output.dropOffPassenger(Id, t.served.goal_node);
            returnToHotspot(t);
            break;
        case IDLE :
            break;
    }
}