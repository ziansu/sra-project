public void move() {
    main.Railway nextRailwaySegment = main.CurrentRailwaySegment.next(main.PreviousRailwaySegment);
    step(nextRailwaySegment);
}