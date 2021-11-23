protected void normalizeIndividualConstraints() throws net.instant.plugins.PluginConflictException {
    for (net.instant.plugins.Plugin p : getAll()) {
        for (net.instant.plugins.Plugin q : getAll()) {
            net.instant.plugins.Constraint pq = p.getConstraint(q);
            net.instant.plugins.Constraint qp = q.getConstraint(p).flip();
            if (!(pq.isCompatible(qp)))
                throw new net.instant.plugins.MutualPluginConflictException(p, q);
            
            p.setConstraint(q, pq.and(qp));
        }
    }
}