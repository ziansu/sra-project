@org.junit.Test
public void randomRestart() {
    core.Heuristic<local.queens.State> heuristic = new local.queens.NumberOfClashesHeuristic();
    local.hillclimbing.RandomRestart<local.queens.State> search = new local.hillclimbing.RandomRestart(heuristic, null, 0);
    search.run(() -> new local.queens.State(8));
}