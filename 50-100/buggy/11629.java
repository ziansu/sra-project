public java.lang.String printJobs() {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    out.append("\nJob ID\tJob name\tStatus\n");
    for (java.lang.String job : mappedJobs.keySet()) {
        out.append(job).append("\t").append(mappedJobs.get(job)[0]).append("\t").append(mappedJobs.get(job)[1]);
    }
    return out.toString();
}