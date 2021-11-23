public boolean allVisited() {
    return (this.history.size()) == (((this.squares.length) * (this.squares[0].length)) + 1);
}