private void solution(java.lang.String name) {
    algorithms.search.Solution<algorithms.mazeGenerators.Position> solution;
    if ((name.length()) != 0) {
        solution = presenter.getModel().getSolution(name);
        if (solution == null)
            presenter.setMessage((("Not exist solution for " + name) + " maze"));
        else
            presenter.setMessage(solution);
        
    }else
        presenter.setMessage((("Not exist solution for " + name) + " maze"));
    
}