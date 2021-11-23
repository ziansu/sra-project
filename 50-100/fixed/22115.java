public int[] getRouteIndeces(int route) {
    int startpoint = 0;
    int endpoint;
    if (!(VARY_ROUTE_LENGTH)) {
        startpoint = (PATH_LENGTH) * route;
        endpoint = startpoint + (PATH_LENGTH);
    }else {
        for (int i = 0; i < route; i++) {
            startpoint += this.getRouteLength(i);
        }
        endpoint = startpoint + (this.getRouteLength(route));
    }
    return new int[]{ startpoint , endpoint };
}