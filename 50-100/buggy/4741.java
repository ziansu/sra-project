public static long count(int[] data) {
    edu.msergey.jalg.sorting.InversionsCounter.inversionsCount = 0;
    edu.msergey.jalg.sorting.InversionsCounter.scratch = new int[data.length];
    edu.msergey.jalg.sorting.InversionsCounter.data = data;
    edu.msergey.jalg.sorting.InversionsCounter.sortAndCount(0, ((data.length) - 1));
    edu.msergey.jalg.sorting.InversionsCounter.scratch = null;
    return edu.msergey.jalg.sorting.InversionsCounter.inversionsCount;
}