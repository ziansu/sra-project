@java.lang.Override
public void neighbourFailed(org.cpsolver.ifs.assignment.Assignment<org.cpsolver.studentsct.model.Request, org.cpsolver.studentsct.model.Enrollment> assignment, long iteration, org.cpsolver.ifs.model.Neighbour<org.cpsolver.studentsct.model.Request, org.cpsolver.studentsct.model.Enrollment> neighbour) {
    org.cpsolver.ifs.heuristics.NeighbourSelection<org.cpsolver.studentsct.model.Request, org.cpsolver.studentsct.model.Enrollment> selection = getSelection();
    if ((neighbour instanceof org.cpsolver.studentsct.heuristics.selection.BranchBoundSelection.BranchBoundNeighbour) && (selection instanceof org.cpsolver.studentsct.heuristics.selection.BranchBoundSelection))
        ((org.cpsolver.studentsct.heuristics.selection.BranchBoundSelection) (selection)).addStudent(((org.cpsolver.studentsct.heuristics.selection.BranchBoundSelection.BranchBoundNeighbour) (neighbour)).getStudent());
    
}