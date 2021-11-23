@java.lang.Override
public void init() {
    super.init();
    openList = new java.util.PriorityQueue<>(new java.util.Comparator<searchLib.State<T>>() {
        @java.lang.Override
        public int compare(searchLib.State<T> s1, searchLib.State<T> s2) {
            return ((int) ((s1.getCost()) - (s2.getCost())));
        }
    });
    closedList = new java.util.LinkedList<searchLib.State<T>>();
}