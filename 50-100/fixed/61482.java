public Position handlePotentialCollisions(Molecule mol, Position nextPos, MolComSim simulation) {
    Position nextPosition = collH.handlePotentialCollisions(mol, nextPos, simulation);
    if (!(simulation.isOccupied(nextPosition))) {
        return nextPosition;
    }else {
        new DiffusiveRandomMovementController(new StandardCollisionHandler(new SimpleCollisionHandler()), simulation, mol);
        return mol.getPosition();
    }
}