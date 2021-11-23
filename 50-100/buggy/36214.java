private void solution(java.lang.String name) {
    algorithms.search.Solution<algorithms.mazeGenerators.Position> solution = presenter.getModel().getSolution(name);
    if (solution == null)
        presenter.setMessage((("Not exist solution for " + name) + " maze"));
    else
        presenter.setMessage(solution);
    
}