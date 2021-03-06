public model.Problem getProblem(int problemId) throws java.security.InvalidKeyException {
    if (problems.containsKey(problemId)) {
        return problems.get(problemId);
    }else {
        throw new java.security.InvalidKeyException(java.lang.String.format("%s is not a known problem", problemId));
    }
}